package com.vil.web.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vil.web.library.BaseLib;
import com.vil.web.reports.MyExtentListners;

public class DBUtil extends BaseLib {

	/*
	 * @author : Srinivas Hippargi
	 * 
	 * Description : Method to close the open SR with adding MSISDN in query
	 */

	public static void closeOpenSR(String msisdn) throws SQLException {
		String query="update siebel.s_SRV_REQ set SR_STAT_ID = 'Cancelled', SR_SUB_STAT_ID = 'Cancelled' where Temp_ph_num = '" + msisdn +  "' and SR_STAT_ID = 'Open'";
		BaseLib.stmt.executeQuery(query);
		BaseLib.stmt.executeQuery("commit");
		
	}
	
	/*
	 * @author : Srinivas Hippargi
	 * 
	 * Description : Method to update item status for particular row id
	 */

	public static void updateItemStatus(String status, String rowId) throws SQLException {
		String query="update siebel.CX_PROV_ITEMS set ITEM_STATUS  = ' " + status + "' where row_id = '" + rowId +  "'";
		ResultSet rset=BaseLib.stmt.executeQuery(query);
		BaseLib.stmt.executeQuery("commit");
		while(rset.next()){
			if(rset.getString("ITEM_STATUS").equals(status)){
				MyExtentListners.test.pass("Updated ITEM_STATUS to " + status  + " for row id " + rowId);
			}else{
				MyExtentListners.test.fail(" Unable to Updat ITEM_STATUS to " + status  + " for row id " + rowId);
			}
		}
	}
	
	/*
	 * @author : Srinivas Hippargi
	 * 
	 * Description : Method to update lead status
	 */

	public static void updateLeadStatus(String status, String leadNum) throws SQLException {
		String query="update SIEBEL.S_LEAD set STATUS_CD=' " + status + "' where LEAD_NUM = '" + leadNum +  "'";
		ResultSet rset=BaseLib.stmt.executeQuery(query);
		BaseLib.stmt.executeQuery("commit");
	}
	
	

}
