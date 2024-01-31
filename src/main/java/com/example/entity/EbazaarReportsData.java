package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EbazaarReportsData {

	
	
	//private Integer Database_Order_No;
	
	private Integer SL_No;
	@Id
    private String OREDER_NO;
    private int ORDER_DETAIL_NO;
    private String EBAZAAR_REQ_ID_PRN;
    private String PAYMENT_STATUS;
    private String SELLER_NAME;
    private String SELLER_GSTNUMBER;
    private String PRODUCT_NAME;
    private String ORDER_TYPE;
    private Double ORDERED_QTY;
    private Double PACKET_SIZE;
    private Double NET_QUANTITY;
    private Double SELLING_PRICE;
    private Double PAYABLE_AMOUNT;
    private Double TAXABLE_VALUE;
    private Double GST_RATE;
    private Double CGST;
    private Double SGST;
    private Double IGST;
    
    private String BUYER_STATE;
    private String ORDER_DATE;
    private String ORDER_STATUS;
    private String STATUS_DATE;
    private String CANCEL_DATE;
    private String DELIVERY_DATE;
    private String RETURN_APPROVE_DATE;
    
    private Double RATE_OF_EBZ_COMM_ON_CITIZEN;
    private String UNIT_OF_EBZ_COMM_ON_CITIZEN;
    private Double EBZ_COMM_ON_CITIZEN;
    private Double ACTUAL_SHIPPING_CHARGED_TO_CITIZEN;
    private Double TOTAL_AMT_CHARGED_TO_CITIZEN;
    private Double RATE_OF_EBZ_COMM_ON_SELLER;
    private String UNIT_OF_EBZ_COMM_ON_SELLER;
    private Double EBZ_COMM_ON_SELLER;
    
    private Double SHIPPING_ON_SELLER;
    private Double TOTAL_COMM;
    private Double TOTAL_SHIPPING;
    private Double TOTAL_DEDUCTION;
    private Double TDS;
    private Double TCS;
    private Double NET_DEDUCTION;
    private String COMMISSION_FLAG;
    private String PAYMENT_FLAG;
    private String RETAILER_GSTNUMBER;
    private int EMITRADIRECTPAID;
	
    public EbazaarReportsData(Integer database_Order_No, Integer sL_No, String oREDER_NO, int oRDER_DETAIL_NO,
			String eBAZAAR_REQ_ID_PRN, String pAYMENT_STATUS, String sELLER_NAME, String sELLER_GSTNUMBER,
			String pRODUCT_NAME, String oRDER_TYPE, Double pACKET_SIZE, Double oRDERED_QTY, Double nET_QUANTITY,
			Double sELLING_PRICE, Double pAYABLE_AMOUNT, Double tAXABLE_VALUE, Double gST_RATE, Double cGST,
			Double sGST, Double iGST, String bUYER_STATE, String oRDER_DATE, String oRDER_STATUS, String sTATUS_DATE,
			String cANCEL_DATE, String dELIVERY_DATE, String rETURN_APPROVE_DATE, Double rATE_OF_EBZ_COMM_ON_CITIZEN,
			String uNIT_OF_EBZ_COMM_ON_CITIZEN, Double eBZ_COMM_ON_CITIZEN, Double aCTUAL_SHIPPING_CHARGED_TO_CITIZEN,
			Double tOTAL_AMT_CHARGED_TO_CITIZEN, Double rATE_OF_EBZ_COMM_ON_SELLER, String uNIT_OF_EBZ_COMM_ON_SELLER,
			Double eBZ_COMM_ON_SELLER, Double sHIPPING_ON_SELLER, Double tOTAL_COMM, Double tOTAL_SHIPPING,
			Double tOTAL_DEDUCTION, Double tDS, Double tCS, Double nET_DEDUCTION, String cOMMISSION_FLAG,
			String pAYMENT_FLAG, String rETAILER_GSTNUMBER, int eMITRADIRECTPAID) {
		//Database_Order_No = database_Order_No;
		SL_No = sL_No;
		OREDER_NO = oREDER_NO;
		ORDER_DETAIL_NO = oRDER_DETAIL_NO;
		EBAZAAR_REQ_ID_PRN = eBAZAAR_REQ_ID_PRN;
		PAYMENT_STATUS = pAYMENT_STATUS;
		SELLER_NAME = sELLER_NAME;
		SELLER_GSTNUMBER = sELLER_GSTNUMBER;
		PRODUCT_NAME = pRODUCT_NAME;
		ORDER_TYPE = oRDER_TYPE;
		PACKET_SIZE = pACKET_SIZE;
		ORDERED_QTY = oRDERED_QTY;
		NET_QUANTITY = nET_QUANTITY;
		SELLING_PRICE = sELLING_PRICE;
		PAYABLE_AMOUNT = pAYABLE_AMOUNT;
		TAXABLE_VALUE = tAXABLE_VALUE;
		GST_RATE = gST_RATE;
		CGST = cGST;
		SGST = sGST;
		IGST = iGST;
		BUYER_STATE = bUYER_STATE;
		ORDER_DATE = oRDER_DATE;
		ORDER_STATUS = oRDER_STATUS;
		STATUS_DATE = sTATUS_DATE;
		CANCEL_DATE = cANCEL_DATE;
		DELIVERY_DATE = dELIVERY_DATE;
		RETURN_APPROVE_DATE = rETURN_APPROVE_DATE;
		RATE_OF_EBZ_COMM_ON_CITIZEN = rATE_OF_EBZ_COMM_ON_CITIZEN;
		UNIT_OF_EBZ_COMM_ON_CITIZEN = uNIT_OF_EBZ_COMM_ON_CITIZEN;
		EBZ_COMM_ON_CITIZEN = eBZ_COMM_ON_CITIZEN;
		ACTUAL_SHIPPING_CHARGED_TO_CITIZEN = aCTUAL_SHIPPING_CHARGED_TO_CITIZEN;
		TOTAL_AMT_CHARGED_TO_CITIZEN = tOTAL_AMT_CHARGED_TO_CITIZEN;
		RATE_OF_EBZ_COMM_ON_SELLER = rATE_OF_EBZ_COMM_ON_SELLER;
		UNIT_OF_EBZ_COMM_ON_SELLER = uNIT_OF_EBZ_COMM_ON_SELLER;
		EBZ_COMM_ON_SELLER = eBZ_COMM_ON_SELLER;
		SHIPPING_ON_SELLER = sHIPPING_ON_SELLER;
		TOTAL_COMM = tOTAL_COMM;
		TOTAL_SHIPPING = tOTAL_SHIPPING;
		TOTAL_DEDUCTION = tOTAL_DEDUCTION;
		TDS = tDS;
		TCS = tCS;
		NET_DEDUCTION = nET_DEDUCTION;
		COMMISSION_FLAG = cOMMISSION_FLAG;
		PAYMENT_FLAG = pAYMENT_FLAG;
		RETAILER_GSTNUMBER = rETAILER_GSTNUMBER;
		EMITRADIRECTPAID = eMITRADIRECTPAID;
	}

	public EbazaarReportsData() {
		
	}

//	public Integer getDatabase_Order_No() {
//		return Database_Order_No;
//	}
//
//	public void setDatabase_Order_No(Integer database_Order_No) {
//		Database_Order_No = database_Order_No;
//	}

	public Integer getSL_No() {
		return SL_No;
	}

	public void setSL_No(Integer sL_No) {
		SL_No = sL_No;
	}

	public String getOREDER_NO() {
		return OREDER_NO;
	}

	public void setOREDER_NO(String oREDER_NO) {
		OREDER_NO = oREDER_NO;
	}

	public int getORDER_DETAIL_NO() {
		return ORDER_DETAIL_NO;
	}

	public void setORDER_DETAIL_NO(int oRDER_DETAIL_NO) {
		ORDER_DETAIL_NO = oRDER_DETAIL_NO;
	}

	public String getEBAZAAR_REQ_ID_PRN() {
		return EBAZAAR_REQ_ID_PRN;
	}

	public void setEBAZAAR_REQ_ID_PRN(String eBAZAAR_REQ_ID_PRN) {
		EBAZAAR_REQ_ID_PRN = eBAZAAR_REQ_ID_PRN;
	}

	public String getPAYMENT_STATUS() {
		return PAYMENT_STATUS;
	}

	public void setPAYMENT_STATUS(String pAYMENT_STATUS) {
		PAYMENT_STATUS = pAYMENT_STATUS;
	}

	public String getSELLER_NAME() {
		return SELLER_NAME;
	}

	public void setSELLER_NAME(String sELLER_NAME) {
		SELLER_NAME = sELLER_NAME;
	}

	public String getSELLER_GSTNUMBER() {
		return SELLER_GSTNUMBER;
	}

	public void setSELLER_GSTNUMBER(String sELLER_GSTNUMBER) {
		SELLER_GSTNUMBER = sELLER_GSTNUMBER;
	}

	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public String getORDER_TYPE() {
		return ORDER_TYPE;
	}

	public void setORDER_TYPE(String oRDER_TYPE) {
		ORDER_TYPE = oRDER_TYPE;
	}

	public Double getPACKET_SIZE() {
		return PACKET_SIZE;
	}

	public void setPACKET_SIZE(Double pACKET_SIZE) {
		PACKET_SIZE = pACKET_SIZE;
	}

	public Double getORDERED_QTY() {
		return ORDERED_QTY;
	}

	public void setORDERED_QTY(Double oRDERED_QTY) {
		ORDERED_QTY = oRDERED_QTY;
	}

	public Double getNET_QUANTITY() {
		return NET_QUANTITY;
	}

	public void setNET_QUANTITY(Double nET_QUANTITY) {
		NET_QUANTITY = nET_QUANTITY;
	}

	public Double getSELLING_PRICE() {
		return SELLING_PRICE;
	}

	public void setSELLING_PRICE(Double sELLING_PRICE) {
		SELLING_PRICE = sELLING_PRICE;
	}

	public Double getPAYABLE_AMOUNT() {
		return PAYABLE_AMOUNT;
	}

	public void setPAYABLE_AMOUNT(Double pAYABLE_AMOUNT) {
		PAYABLE_AMOUNT = pAYABLE_AMOUNT;
	}

	public Double getTAXABLE_VALUE() {
		return TAXABLE_VALUE;
	}

	public void setTAXABLE_VALUE(Double tAXABLE_VALUE) {
		TAXABLE_VALUE = tAXABLE_VALUE;
	}

	public Double getGST_RATE() {
		return GST_RATE;
	}

	public void setGST_RATE(Double gST_RATE) {
		GST_RATE = gST_RATE;
	}

	public Double getCGST() {
		return CGST;
	}

	public void setCGST(Double cGST) {
		CGST = cGST;
	}

	public Double getSGST() {
		return SGST;
	}

	public void setSGST(Double sGST) {
		SGST = sGST;
	}

	public Double getIGST() {
		return IGST;
	}

	public void setIGST(Double iGST) {
		IGST = iGST;
	}

	public String getBUYER_STATE() {
		return BUYER_STATE;
	}

	public void setBUYER_STATE(String bUYER_STATE) {
		BUYER_STATE = bUYER_STATE;
	}

	public String getORDER_DATE() {
		return ORDER_DATE;
	}

	public void setORDER_DATE(String oRDER_DATE) {
		ORDER_DATE = oRDER_DATE;
	}

	public String getORDER_STATUS() {
		return ORDER_STATUS;
	}

	public void setORDER_STATUS(String oRDER_STATUS) {
		ORDER_STATUS = oRDER_STATUS;
	}

	public String getSTATUS_DATE() {
		return STATUS_DATE;
	}

	public void setSTATUS_DATE(String sTATUS_DATE) {
		STATUS_DATE = sTATUS_DATE;
	}

	public String getCANCEL_DATE() {
		return CANCEL_DATE;
	}

	public void setCANCEL_DATE(String cANCEL_DATE) {
		CANCEL_DATE = cANCEL_DATE;
	}

	public String getDELIVERY_DATE() {
		return DELIVERY_DATE;
	}

	public void setDELIVERY_DATE(String dELIVERY_DATE) {
		DELIVERY_DATE = dELIVERY_DATE;
	}

	public String getRETURN_APPROVE_DATE() {
		return RETURN_APPROVE_DATE;
	}

	public void setRETURN_APPROVE_DATE(String rETURN_APPROVE_DATE) {
		RETURN_APPROVE_DATE = rETURN_APPROVE_DATE;
	}

	public Double getRATE_OF_EBZ_COMM_ON_CITIZEN() {
		return RATE_OF_EBZ_COMM_ON_CITIZEN;
	}

	public void setRATE_OF_EBZ_COMM_ON_CITIZEN(Double rATE_OF_EBZ_COMM_ON_CITIZEN) {
		RATE_OF_EBZ_COMM_ON_CITIZEN = rATE_OF_EBZ_COMM_ON_CITIZEN;
	}

	public String getUNIT_OF_EBZ_COMM_ON_CITIZEN() {
		return UNIT_OF_EBZ_COMM_ON_CITIZEN;
	}

	public void setUNIT_OF_EBZ_COMM_ON_CITIZEN(String uNIT_OF_EBZ_COMM_ON_CITIZEN) {
		UNIT_OF_EBZ_COMM_ON_CITIZEN = uNIT_OF_EBZ_COMM_ON_CITIZEN;
	}

	public Double getEBZ_COMM_ON_CITIZEN() {
		return EBZ_COMM_ON_CITIZEN;
	}

	public void setEBZ_COMM_ON_CITIZEN(Double eBZ_COMM_ON_CITIZEN) {
		EBZ_COMM_ON_CITIZEN = eBZ_COMM_ON_CITIZEN;
	}

	public Double getACTUAL_SHIPPING_CHARGED_TO_CITIZEN() {
		return ACTUAL_SHIPPING_CHARGED_TO_CITIZEN;
	}

	public void setACTUAL_SHIPPING_CHARGED_TO_CITIZEN(Double aCTUAL_SHIPPING_CHARGED_TO_CITIZEN) {
		ACTUAL_SHIPPING_CHARGED_TO_CITIZEN = aCTUAL_SHIPPING_CHARGED_TO_CITIZEN;
	}

	public Double getTOTAL_AMT_CHARGED_TO_CITIZEN() {
		return TOTAL_AMT_CHARGED_TO_CITIZEN;
	}

	public void setTOTAL_AMT_CHARGED_TO_CITIZEN(Double tOTAL_AMT_CHARGED_TO_CITIZEN) {
		TOTAL_AMT_CHARGED_TO_CITIZEN = tOTAL_AMT_CHARGED_TO_CITIZEN;
	}

	public Double getRATE_OF_EBZ_COMM_ON_SELLER() {
		return RATE_OF_EBZ_COMM_ON_SELLER;
	}

	public void setRATE_OF_EBZ_COMM_ON_SELLER(Double rATE_OF_EBZ_COMM_ON_SELLER) {
		RATE_OF_EBZ_COMM_ON_SELLER = rATE_OF_EBZ_COMM_ON_SELLER;
	}

	public String getUNIT_OF_EBZ_COMM_ON_SELLER() {
		return UNIT_OF_EBZ_COMM_ON_SELLER;
	}

	public void setUNIT_OF_EBZ_COMM_ON_SELLER(String uNIT_OF_EBZ_COMM_ON_SELLER) {
		UNIT_OF_EBZ_COMM_ON_SELLER = uNIT_OF_EBZ_COMM_ON_SELLER;
	}

	public Double getEBZ_COMM_ON_SELLER() {
		return EBZ_COMM_ON_SELLER;
	}

	public void setEBZ_COMM_ON_SELLER(Double eBZ_COMM_ON_SELLER) {
		EBZ_COMM_ON_SELLER = eBZ_COMM_ON_SELLER;
	}

	public Double getSHIPPING_ON_SELLER() {
		return SHIPPING_ON_SELLER;
	}

	public void setSHIPPING_ON_SELLER(Double sHIPPING_ON_SELLER) {
		SHIPPING_ON_SELLER = sHIPPING_ON_SELLER;
	}

	public Double getTOTAL_COMM() {
		return TOTAL_COMM;
	}

	public void setTOTAL_COMM(Double tOTAL_COMM) {
		TOTAL_COMM = tOTAL_COMM;
	}

	public Double getTOTAL_SHIPPING() {
		return TOTAL_SHIPPING;
	}

	public void setTOTAL_SHIPPING(Double tOTAL_SHIPPING) {
		TOTAL_SHIPPING = tOTAL_SHIPPING;
	}

	public Double getTOTAL_DEDUCTION() {
		return TOTAL_DEDUCTION;
	}

	public void setTOTAL_DEDUCTION(Double tOTAL_DEDUCTION) {
		TOTAL_DEDUCTION = tOTAL_DEDUCTION;
	}

	public Double getTDS() {
		return TDS;
	}

	public void setTDS(Double tDS) {
		TDS = tDS;
	}

	public Double getTCS() {
		return TCS;
	}

	public void setTCS(Double tCS) {
		TCS = tCS;
	}

	public Double getNET_DEDUCTION() {
		return NET_DEDUCTION;
	}

	public void setNET_DEDUCTION(Double nET_DEDUCTION) {
		NET_DEDUCTION = nET_DEDUCTION;
	}

	public String getCOMMISSION_FLAG() {
		return COMMISSION_FLAG;
	}

	public void setCOMMISSION_FLAG(String cOMMISSION_FLAG) {
		COMMISSION_FLAG = cOMMISSION_FLAG;
	}

	public String getPAYMENT_FLAG() {
		return PAYMENT_FLAG;
	}

	public void setPAYMENT_FLAG(String pAYMENT_FLAG) {
		PAYMENT_FLAG = pAYMENT_FLAG;
	}

	public String getRETAILER_GSTNUMBER() {
		return RETAILER_GSTNUMBER;
	}

	public void setRETAILER_GSTNUMBER(String rETAILER_GSTNUMBER) {
		RETAILER_GSTNUMBER = rETAILER_GSTNUMBER;
	}

	public int getEMITRADIRECTPAID() {
		return EMITRADIRECTPAID;
	}

	public void setEMITRADIRECTPAID(int eMITRADIRECTPAID) {
		EMITRADIRECTPAID = eMITRADIRECTPAID;
	}

	@Override
	public String toString() {
		return "EbazaarReportsData [SL_No=" + SL_No + ", OREDER_NO="
				+ OREDER_NO + ", ORDER_DETAIL_NO=" + ORDER_DETAIL_NO + ", EBAZAAR_REQ_ID_PRN=" + EBAZAAR_REQ_ID_PRN
				+ ", PAYMENT_STATUS=" + PAYMENT_STATUS + ", SELLER_NAME=" + SELLER_NAME + ", SELLER_GSTNUMBER="
				+ SELLER_GSTNUMBER + ", PRODUCT_NAME=" + PRODUCT_NAME + ", ORDER_TYPE=" + ORDER_TYPE + ", PACKET_SIZE="
				+ PACKET_SIZE + ", ORDERED_QTY=" + ORDERED_QTY + ", NET_QUANTITY=" + NET_QUANTITY + ", SELLING_PRICE="
				+ SELLING_PRICE + ", PAYABLE_AMOUNT=" + PAYABLE_AMOUNT + ", TAXABLE_VALUE=" + TAXABLE_VALUE
				+ ", GST_RATE=" + GST_RATE + ", CGST=" + CGST + ", SGST=" + SGST + ", IGST=" + IGST + ", BUYER_STATE="
				+ BUYER_STATE + ", ORDER_DATE=" + ORDER_DATE + ", ORDER_STATUS=" + ORDER_STATUS + ", STATUS_DATE="
				+ STATUS_DATE + ", CANCEL_DATE=" + CANCEL_DATE + ", DELIVERY_DATE=" + DELIVERY_DATE
				+ ", RETURN_APPROVE_DATE=" + RETURN_APPROVE_DATE + ", RATE_OF_EBZ_COMM_ON_CITIZEN="
				+ RATE_OF_EBZ_COMM_ON_CITIZEN + ", UNIT_OF_EBZ_COMM_ON_CITIZEN=" + UNIT_OF_EBZ_COMM_ON_CITIZEN
				+ ", EBZ_COMM_ON_CITIZEN=" + EBZ_COMM_ON_CITIZEN + ", ACTUAL_SHIPPING_CHARGED_TO_CITIZEN="
				+ ACTUAL_SHIPPING_CHARGED_TO_CITIZEN + ", TOTAL_AMT_CHARGED_TO_CITIZEN=" + TOTAL_AMT_CHARGED_TO_CITIZEN
				+ ", RATE_OF_EBZ_COMM_ON_SELLER=" + RATE_OF_EBZ_COMM_ON_SELLER + ", UNIT_OF_EBZ_COMM_ON_SELLER="
				+ UNIT_OF_EBZ_COMM_ON_SELLER + ", EBZ_COMM_ON_SELLER=" + EBZ_COMM_ON_SELLER + ", SHIPPING_ON_SELLER="
				+ SHIPPING_ON_SELLER + ", TOTAL_COMM=" + TOTAL_COMM + ", TOTAL_SHIPPING=" + TOTAL_SHIPPING
				+ ", TOTAL_DEDUCTION=" + TOTAL_DEDUCTION + ", TDS=" + TDS + ", TCS=" + TCS + ", NET_DEDUCTION="
				+ NET_DEDUCTION + ", COMMISSION_FLAG=" + COMMISSION_FLAG + ", PAYMENT_FLAG=" + PAYMENT_FLAG
				+ ", RETAILER_GSTNUMBER=" + RETAILER_GSTNUMBER + ", EMITRADIRECTPAID=" + EMITRADIRECTPAID + "]";
	}
	
	
  
	
	
}
