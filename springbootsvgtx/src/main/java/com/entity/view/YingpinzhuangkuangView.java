package com.entity.view;

import com.entity.YingpinzhuangkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 应聘状况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
@TableName("yingpinzhuangkuang")
public class YingpinzhuangkuangView  extends YingpinzhuangkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingpinzhuangkuangView(){
	}
 
 	public YingpinzhuangkuangView(YingpinzhuangkuangEntity yingpinzhuangkuangEntity){
 	try {
			BeanUtils.copyProperties(this, yingpinzhuangkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
