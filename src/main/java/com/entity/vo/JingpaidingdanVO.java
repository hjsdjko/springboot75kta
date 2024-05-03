package com.entity.vo;

import com.entity.JingpaidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 竞拍订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-03 10:36:55
 */
public class JingpaidingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 起拍价
	 */
	
	private Integer qipaijia;
		
	/**
	 * 当前价
	 */
	
	private Integer dangqianjia;
		
	/**
	 * 出价
	 */
	
	private Integer chujia;
		
	/**
	 * 竞拍时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jingpaishijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 拍卖者账号
	 */
	
	private String paimaizhezhanghao;
		
	/**
	 * 拍卖者姓名
	 */
	
	private String paimaizhexingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：起拍价
	 */
	 
	public void setQipaijia(Integer qipaijia) {
		this.qipaijia = qipaijia;
	}
	
	/**
	 * 获取：起拍价
	 */
	public Integer getQipaijia() {
		return qipaijia;
	}
				
	
	/**
	 * 设置：当前价
	 */
	 
	public void setDangqianjia(Integer dangqianjia) {
		this.dangqianjia = dangqianjia;
	}
	
	/**
	 * 获取：当前价
	 */
	public Integer getDangqianjia() {
		return dangqianjia;
	}
				
	
	/**
	 * 设置：出价
	 */
	 
	public void setChujia(Integer chujia) {
		this.chujia = chujia;
	}
	
	/**
	 * 获取：出价
	 */
	public Integer getChujia() {
		return chujia;
	}
				
	
	/**
	 * 设置：竞拍时间
	 */
	 
	public void setJingpaishijian(Date jingpaishijian) {
		this.jingpaishijian = jingpaishijian;
	}
	
	/**
	 * 获取：竞拍时间
	 */
	public Date getJingpaishijian() {
		return jingpaishijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：拍卖者账号
	 */
	 
	public void setPaimaizhezhanghao(String paimaizhezhanghao) {
		this.paimaizhezhanghao = paimaizhezhanghao;
	}
	
	/**
	 * 获取：拍卖者账号
	 */
	public String getPaimaizhezhanghao() {
		return paimaizhezhanghao;
	}
				
	
	/**
	 * 设置：拍卖者姓名
	 */
	 
	public void setPaimaizhexingming(String paimaizhexingming) {
		this.paimaizhexingming = paimaizhexingming;
	}
	
	/**
	 * 获取：拍卖者姓名
	 */
	public String getPaimaizhexingming() {
		return paimaizhexingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
