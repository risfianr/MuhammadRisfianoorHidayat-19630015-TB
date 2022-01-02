/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;


public class UserID {
    private static String kd;

    public static String getUserLogin() {
        return kd;
    }

    /**
     * @param aKd the kd to set
     */
    public static void setUserLogin(String kode) {
        kd = kode;
    }
    
}
