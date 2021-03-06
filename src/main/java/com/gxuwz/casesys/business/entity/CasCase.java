package com.gxuwz.casesys.business.entity;

import java.util.Date;

/**
 * CasCase entity. @author MyEclipse Persistence Tools
 */

public class CasCase implements java.io.Serializable {

	// Fields

	private Integer id;
	private String patientCode;
	private Date visitime; // 就诊时间
	private String pulse; //脉象
	private String tongueQuality;//舌质
	private String fur;//舌苔
	private String tongue;//舌体
	private Integer sixChannel;//六经症状 太阴 少阴 厥阴 太阳 阳明 少阳
	private Integer face;//面部皮肤 青  赤 黄 白 黑
	private String cough;// 咳嗽
	private String excrement;//大便
	private String pee;// 小便
	private String coldHot;//冷热
	private String sweat;// 汗
	private String headBody;// 头身
	private String diet;// 饮食
	private String thirsty;//渴
	private String ear;//耳
	private String earOil;//耳油
	private String menstruation;//月经
	private String liverFunction;//肝功能
	private String renalFunction;//肾功能
	private String bloodRoutine;//血常规
	private Date updateTime;//更新时间
	private Integer status;//状态

	// Constructors

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	/** default constructor */
	public CasCase() {
	}

	/** minimal constructor */
	public CasCase(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public CasCase(Integer id, String patientCode, Date visitime, String pulse, String tongueQuality, String fur,
			String tongue, Integer sixChannel, Integer face, String cough, String excrement, String pee, String coldHot,
			String sweat, String headBody, String diet, String thirsty, String ear, String earOil, String menstruation,
			String liverFunction, String renalFunction, String bloodRoutine,Date updateTime, Integer status) {
		this.id = id;
		this.patientCode = patientCode;
		this.visitime = visitime;
		this.pulse = pulse;
		this.tongueQuality = tongueQuality;
		this.fur = fur;
		this.tongue = tongue;
		this.sixChannel = sixChannel;
		this.face = face;
		this.cough = cough;
		this.excrement = excrement;
		this.pee = pee;
		this.coldHot = coldHot;
		this.sweat = sweat;
		this.headBody = headBody;
		this.diet = diet;
		this.thirsty = thirsty;
		this.ear = ear;
		this.earOil = earOil;
		this.menstruation = menstruation;
		this.liverFunction = liverFunction;
		this.renalFunction = renalFunction;
		this.bloodRoutine = bloodRoutine;
		this.updateTime = updateTime;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientCode() {
		return this.patientCode;
	}

	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
	}

	public String getPulse() {
		return this.pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public String getTongueQuality() {
		return this.tongueQuality;
	}

	public void setTongueQuality(String tongueQuality) {
		this.tongueQuality = tongueQuality;
	}

	public String getFur() {
		return this.fur;
	}

	public void setFur(String fur) {
		this.fur = fur;
	}

	public String getTongue() {
		return this.tongue;
	}

	public void setTongue(String tongue) {
		this.tongue = tongue;
	}



	public String getCough() {
		return this.cough;
	}

	public void setCough(String cough) {
		this.cough = cough;
	}

	public Date getVisitime() {
		return visitime;
	}

	public void setVisitime(Date visitime) {
		this.visitime = visitime;
	}

	public Integer getSixChannel() {
		return sixChannel;
	}

	public void setSixChannel(Integer sixChannel) {
		this.sixChannel = sixChannel;
	}

	public Integer getFace() {
		return face;
	}

	public void setFace(Integer face) {
		this.face = face;
	}

	public String getExcrement() {
		return this.excrement;
	}

	public void setExcrement(String excrement) {
		this.excrement = excrement;
	}

	public String getPee() {
		return this.pee;
	}

	public void setPee(String pee) {
		this.pee = pee;
	}

	public String getColdHot() {
		return this.coldHot;
	}

	public void setColdHot(String coldHot) {
		this.coldHot = coldHot;
	}

	public String getSweat() {
		return this.sweat;
	}

	public void setSweat(String sweat) {
		this.sweat = sweat;
	}

	public String getHeadBody() {
		return this.headBody;
	}

	public void setHeadBody(String headBody) {
		this.headBody = headBody;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getThirsty() {
		return this.thirsty;
	}

	public void setThirsty(String thirsty) {
		this.thirsty = thirsty;
	}

	public String getEar() {
		return this.ear;
	}

	public void setEar(String ear) {
		this.ear = ear;
	}

	public String getEarOil() {
		return this.earOil;
	}

	public void setEarOil(String earOil) {
		this.earOil = earOil;
	}

	public String getMenstruation() {
		return this.menstruation;
	}

	public void setMenstruation(String menstruation) {
		this.menstruation = menstruation;
	}

	public String getLiverFunction() {
		return this.liverFunction;
	}

	public void setLiverFunction(String liverFunction) {
		this.liverFunction = liverFunction;
	}

	public String getRenalFunction() {
		return this.renalFunction;
	}

	public void setRenalFunction(String renalFunction) {
		this.renalFunction = renalFunction;
	}

	public String getBloodRoutine() {
		return this.bloodRoutine;
	}

	public void setBloodRoutine(String bloodRoutine) {
		this.bloodRoutine = bloodRoutine;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	

}