/*
 * This file is generated by jOOQ.
 */
package vn.team.system.repository.model;


import vn.team.system.repository.model.routines.Spgettop10staff;
import vn.team.system.repository.model.routines.Spthongkethanhtich;
import vn.team.system.repository.model.routines.Spthongkethanhtichphongban;

import org.jooq.Configuration;


/**
 * Convenience access to all stored procedures and functions in Personel
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>Personel.spGetTop10Staff</code>
     */
    public static void spgettop10staff(Configuration configuration) {
        Spgettop10staff p = new Spgettop10staff();

        p.execute(configuration);
    }

    /**
     * Call <code>Personel.spThongKeThanhTich</code>
     */
    public static void spthongkethanhtich(Configuration configuration, String _Staffid) {
        Spthongkethanhtich p = new Spthongkethanhtich();
        p.set_Staffid(_Staffid);

        p.execute(configuration);
    }

    /**
     * Call <code>Personel.spThongKeThanhTichPhongBan</code>
     */
    public static void spthongkethanhtichphongban(Configuration configuration) {
        Spthongkethanhtichphongban p = new Spthongkethanhtichphongban();

        p.execute(configuration);
    }
}
