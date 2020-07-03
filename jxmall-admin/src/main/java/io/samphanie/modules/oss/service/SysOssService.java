package io.samphanie.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.samphanie.common.utils.PageUtils;
import io.samphanie.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
