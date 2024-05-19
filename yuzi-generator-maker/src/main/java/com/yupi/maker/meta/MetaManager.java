package com.yupi.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * 元管理器
 *
 * @author xuYuYu
 * @date 2024-05-17 22:10:22
 */
public class MetaManager {

	private static volatile Meta meta;

	public static Meta getMetaObject() {
		if (meta == null) {
			synchronized (MetaManager.class) {
				if (meta == null) {
					meta = initMeta();
				}
			}
		}
		return meta;
	}

	private static Meta initMeta() {
		String metaJson = ResourceUtil.readUtf8Str("meta.json");
		Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
		return newMeta;
	}

}
