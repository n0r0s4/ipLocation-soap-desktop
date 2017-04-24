/* 
  ___  __  ____  ____    ____  _  _    __ _   __  ____  ____  ____  ____  ____ 
 / __)/  \(    \(  __)  (  _ \( \/ )  (  ( \ /  \(  _ \(  _ \(  __)(  _ \(_  _)
( (__(  O )) D ( ) _)    ) _ ( )  /   /    /(  O ))   / ) _ ( ) _)  )   /  )(  
 \___)\__/(____/(____)  (____/(__/    \_)__) \__/(__\_)(____/(____)(__\_) (__)

                                                           norosa@programmer.net
 */
package com.mseven.clientsoap;

import wsclient.*;

/**
 *
 * @author Norber
 */
public class IpLocation {
    public static void main(String[] args){
       if (args.length != 1)
           System.out.println("Ip is required");
       else{
           String ip = args[0];
           GeoIPService gips = new GeoIPService();
           GeoIPServiceSoap gipsSoap = gips.getGeoIPServiceSoap();
           GeoIP location = gipsSoap.getGeoIP(ip);
           System.out.println(location.getCountryName());
       }
    }
}
