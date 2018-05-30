package com.vil.web.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.testng.annotations.Test;

public class Sample {

	@Test 
	public void sample() throws Exception{
	/*	LoginPage loginPage=new LoginPage(driver);
		QueuePage qp=new QueuePage(driver);
		ActionUtil.type(loginPage.getEleUserNameTxtFld(), "DB0064787", " USERNAME text field ", driver);
		ActionUtil.type(loginPage.getElePasswordTxtFld(), "TechM@1234567", " PASSWORD text field ", driver);
		ActionUtil.clickElement(loginPage.getEleLoginSubmitBtn(), driver, " Login Button");
		Thread.sleep(60000);
		ActionUtil.uploadCsvFile(driver, loginPage.getEleLoginSubmitBtn());*/
		/*try {
			Properties p = GenericLib.getPropertyFile(GenericLib.sDirPath + "/DBConfig.properties");
			String host = p.getProperty("HOSTNAME");
			String port = p.getProperty("PORT");
			String sid = p.getProperty("SID");
			String username = p.getProperty("USERNAME");
			String password = p.getProperty("PASSWORD");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:" + username +"/"  + password +  "@//" + host + ":" + port + "/" + sid);
			System.out.println("-------DB Connection Opened---------");
//			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + sid,
//					username, password);
			Statement stmt = connection.createStatement();
			ResultSet rset=stmt.executeQuery("select * from siebel.S_SRV_REQ_XM where NAME ='Awaiting Submission Time'");
			while(rset.next()){
				System.out.println(rset.getString(""));
			}
			connection.close();
			System.out.println("-------DB Connection Closed---------");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found from database");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("ORACLE Connection error ");
			e1.printStackTrace();
		}*/
	
		/*Map<String, String> tagsMap=new LinkedHashMap<String,String>();
		tagsMap.put("Field01", "89912000147777775793");
		tagsMap.put("Field02", "9619008793");
		UpdateXml.traverseInXmlAndUpdate("C:/Users/rp003786/Desktop/pretopost.xml","TmCafAdditionalInfoBc",tagsMap);*/
		
		//String dateValue="17-Apr-2018 03:01:30 PM";
		
	   /* SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
	    TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
	    Date d = new Date();
	    dateTimeInGMT.setTimeZone(istTimeZone);
	    String strtime = dateTimeInGMT.format(d);
	    System.out.println(strtime);*/
	    
	  /*  SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
    	TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
    	Date currentDate = new Date();
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(currentDate);
    	calendar.add(Calendar.DATE, 3);
    	int days = 6;
        for(int i=0;i<days;)
        {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            //here even sat and sun are added
            //but at the end it goes to the correct week day.
            //because i is only increased if it is week day
            if(calendar.get(Calendar.DAY_OF_WEEK)<=6)
            {
                i++;
            }
        }
    	
    	
    	calendar.add(Calendar.DATE, 3);
    	calendar.add(Calendar.MINUTE, 30);
    	Date finalNewDate = calendar.getTime();
    	dateTimeInGMT.setTimeZone(istTimeZone);
    	String finalNewDateString = dateTimeInGMT.format(finalNewDate);
    	System.out.println(finalNewDateString);
    	if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
    	    System.out.println("Wednesday!");
    	}*/
	    
	    
	    
		/*SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
		TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
				//Calendar.getInstance();
		calendar.setTime(currentDate);
		int days=4;
		boolean flag=false;

		//calendar.set(calendar.DAY_OF_WEEK, calendar.get(Calendar.DAY_OF_WEEK));
		for (int i = 0; i <days;) {
			
			// here even sat and sun are added
			// but at the end it goes to the correct week day.
			// because i is only increased if it is week day
			
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				flag=true;
				if (flag == true) {
					System.out.println("its sunday");
					flag=false;
					i++;
				}
			}
			if(flag==false){
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				i++;
			}
		}*/

		/*// calendar.add(Calendar.DATE, days);
		Date finalNewDate = calendar.getTime();
		dateTimeInGMT.setTimeZone(istTimeZone);
		String finalNewDateString = dateTimeInGMT.format(finalNewDate);
		System.out.println(finalNewDateString);*/
		
		/*SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss aa");
		TimeZone istTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
		Date currentDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);
		System.out.println("SUNDAY--------" + calendar.SUNDAY);
    	System.out.println("MONDAY--------" + calendar.MONDAY);
    	System.out.println("TUESDAY--------" + calendar.TUESDAY);
    	System.out.println("WEDNESDAY--------" + calendar.WEDNESDAY);
    	System.out.println("THURSDAY--------" + calendar.THURSDAY);
    	System.out.println("FRIDAY--------" + calendar.FRIDAY);
    	System.out.println("SATURDAY--------" + calendar.SATURDAY);
    	System.out.println("SUNDAY--------" + calendar.SUNDAY);
		int days = 10;
	    for(int i=0;i<days;)
	    {
	    
	    	
	        calendar.add(Calendar.DAY_OF_MONTH, 1);
	        //here even sat and sun are added
	        //but at the end it goes to the correct week day.
	        //because i is only increased if it is week day
	        if(calendar.get(Calendar.DAY_OF_WEEK)>1)
	        {
	            i++;
	        }

	    }
		Date finalNewDate = calendar.getTime();
		dateTimeInGMT.setTimeZone(istTimeZone);
		String finalNewDateString = dateTimeInGMT.format(finalNewDate);
		System.out.println(finalNewDateString);
		
		*/

		
		
		
		//return finalNewDateString;
		
		
		
	    
	   /* DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MMM-yyyy hh:mm:ss aa");
	    DateTime dt = formatter.parseDateTime(strtime);
	    dt.plusMinutes(30);
	    dt.plusHours(1);
	    System.out.println(dt.toString());
	    */
		/* DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MMM-yyyy hh:mm:ss aa");
		 DateTime dateTime = formatter.parseDateTime(strtime);
		 
	        System.out.println("DateTime            = " + dateTime);

	        // Plus some hours, minutes, and seconds to the original DateTime.
	        System.out.println("Plus 60 seconds is  = " + dateTime.plusSeconds(60));
	        System.out.println("Plus 10 minutes is  = " + dateTime.plusMinutes(10));
	        System.out.println("Plus 1 hour is      = " + dateTime.plusHours(1));

	        // Minus some hours, minutes, and seconds to the original DateTime.
	        System.out.println("Minus 60 seconds is = " + dateTime.minusSeconds(60));
	        System.out.println("Minus 10 minutes is = " + dateTime.minusMinutes(30));
	        System.out.println("Minus 1 hour is     = " + dateTime.minusHours(1));
		
		
	        String string3 = "12-Apr-2014 01:10 PM";
	    	DateFormat inFormat3 = new SimpleDateFormat( "dd-MMM-yyyy hh:mm aa");
	    	DateFormat outFormat = new SimpleDateFormat( "yyyy/MMM/dd HH:mm:ss");
	    	Date date3 = null;
	    	Date date = null;
	    	 date3 = inFormat3.parse(string3);
	    	 
	     	    String myDate3 = outFormat.format(date3);
	     	  
	     	    System.out.println(myDate3);
	     	
	      
	    DateTime jodaTime = DateTime.parse(dateTimeInGMT.format(d));
	    jodaTime = new DateTime(strtime);
	    jodaTime = jodaTime.plusMinutes(30);
	    System.out.println(""+jodaTime);
	    
	    DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	    Date date = sdf.parse(strtime);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);

	    //cal.add(Calendar.HOUR_OF_DAY, hours);
	    cal.add(Calendar.MINUTE, 30);

	    date = cal.getTime();

	    
	    
	    
	    //Calendar cal=Calendar.
        // SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                //Setting the time zone
                dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("UTC+5:30"));


                System.out.println(dateTimeInGMT.format(new Date()));
	 
                formatter.setCalendar(calendar);
                formatter.setTimeZone(TimeZone.getTimeZone(timeZone));
	    TimeZone tz = TimeZone.getTimeZone("Asia/Calcutta");
	    Calendar cal = Calendar.getInstance(tz);
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss aa");
	    sdf.setCalendar(cal);
	    cal.setTime(sdf.parse(dateValue));
	    Date date = cal.getTime();
	    System.out.println(date.toString());

	    
	    final long ONE_MINUTE_IN_MILLIS=60000;//millisecs

	    Calendar date = Calendar.getInstance();
	    long t= date.getTimeInMillis();
	    Date afterAddingTenMins=new Date(t + (10 * ONE_MINUTE_IN_MILLIS));
	    System.out.println(afterAddingTenMins.toString());
	  */
	}
}
