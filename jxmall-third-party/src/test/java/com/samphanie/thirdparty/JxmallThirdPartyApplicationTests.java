package com.samphanie.thirdparty;

import com.aliyun.oss.OSSClient;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class JxmallThirdPartyApplicationTests {

    @Resource
    private OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    void aliYunUpload() {

        // 上传网络流。
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\Dries\\Desktop\\docs\\pics\\6a1b2703a9ed8737.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ossClient.putObject("dries-jxmall", "hahhh.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传成功！");
    }

    /**
     * 七牛云
     */
    @Test
    void qiNiuUpload() {
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region2());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "gAIEfw0VGmrgX6PcolL7rWPGOtSIB_3ZQrimFrjO";
        String secretKey = "rNTVADzrpqp-WxoUehxOTYhkjyyTtPR-Vy1CgN2V";
        String bucket = "samphanie";
        //如果是Windows情况下，格式是 D:\\qiniu\\test.png
        //    String localFilePath = "/home/qiniu/test.png";
        String localFilePath = "E:\\WorkSpace\\test.jpeg";
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
    }

}
