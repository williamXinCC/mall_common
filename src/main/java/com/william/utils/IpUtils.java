package com.william.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.*;
import java.util.Enumeration;

/**
 * @author xinchuang
 * @version v1.0
 * @date 2019/10/15 10:22
 * @since Copyright(c) 爱睿智健康科技
 */
public class IpUtils {

    private static final Logger logger = LoggerFactory.getLogger(IpUtils.class);
    private static final String OS_NAME = System.getProperty("os.name");
    private static boolean isLinuxPlatform = false;
    private static boolean isWindowsPlatform = false;

    static {
        if (OS_NAME != null && OS_NAME.toLowerCase().contains("linux")) {
            isLinuxPlatform = true;
        }

        if (OS_NAME != null && OS_NAME.toLowerCase().contains("windows")) {
            isWindowsPlatform = true;
        }
    }

    public static String getIp(){
        if(isLinuxPlatform){
            String linuxLocalIP = getLinuxLocalIP();
            logger.warn("获取linux系统IP成功:  " + linuxLocalIP);
            return linuxLocalIP;
        }else if(isWindowsPlatform) {
            String windowsIp = getWindowsIp();
            logger.warn("获取windows系统IP成功:  " + windowsIp);
            return windowsIp;
        }else {
            throw new RuntimeException("无法获取系统IP");
        }
    }


    private static String getWindowsIp() {
        try {
            for (Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces(); e.hasMoreElements(); ) {
                NetworkInterface item = e.nextElement();
                for (InterfaceAddress address : item.getInterfaceAddresses()) {
                    if (item.isLoopback() || !item.isUp()) {
                        continue;
                    }
                    if (address.getAddress() instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address.getAddress();
                        return inet4Address.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return null;
    }

    private static String getLinuxLocalIP() {
        String ip = "";
        try {
            Enumeration<?> e1 = (Enumeration<?>) NetworkInterface.getNetworkInterfaces();
            while (e1.hasMoreElements()) {
                NetworkInterface ni = (NetworkInterface) e1.nextElement();
                if (ni.getName().equals("eth0")) {
                    Enumeration<?> e2 = ni.getInetAddresses();
                    while (e2.hasMoreElements()) {
                        InetAddress ia = (InetAddress) e2.nextElement();
                        if (ia instanceof Inet6Address){
                            continue;
                        }
                        ip = ia.getHostAddress();
                    }
                    break;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return ip;
    }

    public static void main(String[] args) {
        String ip = IpUtils.getIp();
        System.out.println(ip);
    }
}
