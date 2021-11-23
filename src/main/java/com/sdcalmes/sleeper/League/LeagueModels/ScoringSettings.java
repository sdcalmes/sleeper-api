package com.sdcalmes.sleeper.League.LeagueModels;

import com.google.gson.annotations.SerializedName;

public class ScoringSettings {
    private double pass_2pt;
    private double kr_yd;
    private double tkl_loss;
    private double pass_double;
    private double fgmiss;
    private double rec_yd;
    private double xpmiss;
    private double fgm_30_39;
    private double blk_kick;
    private double pts_allow_7_13;
    private double ff;
    private double fgm_20_29;
    private double fgm_40_49;
    private double pts_allow_1_6;
    private double st_fum_rec;
    private double def_st_ff;
    private double st_ff;
    private double pts_allow_28_34;
    private double fgm_50p;
    private double fum_rec;
    private double def_td;
    private double fgm_0_19;

    @SerializedName("int")
    private double interceptions;

    private double pts_allow_0;
    private double pts_allow_21_27;
    private double rec_2pt;
    private double rec;
    private double xpm;
    private double st_td;
    private double def_st_fum_rec;
    private double sack;
    private double rush_2pt;
    private double rec_td;
    private double pts_allow_35p;
    private double pts_allow_14_20;
    private double rush_yd;
    private double pass_yd;
    private double pass_td;
    private double rush_td;
    private double fum_lost;
    private double fum;
    private double safe;

    public double getPass_2pt() {
        return pass_2pt;
    }

    public double getKr_yd() {
        return kr_yd;
    }

    public double getTkl_loss() {
        return tkl_loss;
    }

    public double getPass_double() {
        return pass_double;
    }

    public double getFgmiss() {
        return fgmiss;
    }

    public double getRec_yd() {
        return rec_yd;
    }

    public double getXpmiss() {
        return xpmiss;
    }

    public double getFgm_30_39() {
        return fgm_30_39;
    }

    public double getBlk_kick() {
        return blk_kick;
    }

    public double getPts_allow_7_13() {
        return pts_allow_7_13;
    }

    public double getFf() {
        return ff;
    }

    public double getFgm_20_29() {
        return fgm_20_29;
    }

    public double getFgm_40_49() {
        return fgm_40_49;
    }

    public double getPts_allow_1_6() {
        return pts_allow_1_6;
    }

    public double getSt_fum_rec() {
        return st_fum_rec;
    }

    public double getDef_st_ff() {
        return def_st_ff;
    }

    public double getSt_ff() {
        return st_ff;
    }

    public double getPts_allow_28_34() {
        return pts_allow_28_34;
    }

    public double getFgm_50p() {
        return fgm_50p;
    }

    public double getFum_rec() {
        return fum_rec;
    }

    public double getDef_td() {
        return def_td;
    }

    public double getFgm_0_19() {
        return fgm_0_19;
    }

    public double getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(double interceptions) {
        this.interceptions = interceptions;
    }

    public double getPts_allow_0() {
        return pts_allow_0;
    }

    public double getPts_allow_21_27() {
        return pts_allow_21_27;
    }

    public double getRec_2pt() {
        return rec_2pt;
    }

    public double getRec() {
        return rec;
    }

    public double getXpm() {
        return xpm;
    }

    public double getSt_td() {
        return st_td;
    }

    public double getDef_st_fum_rec() {
        return def_st_fum_rec;
    }

    public double getSack() {
        return sack;
    }

    public double getRush_2pt() {
        return rush_2pt;
    }

    public double getRec_td() {
        return rec_td;
    }

    public double getPts_allow_35p() {
        return pts_allow_35p;
    }

    public double getPts_allow_14_20() {
        return pts_allow_14_20;
    }

    public double getRush_yd() {
        return rush_yd;
    }

    public double getPass_yd() {
        return pass_yd;
    }

    public double getPass_td() {
        return pass_td;
    }

    public double getRush_td() {
        return rush_td;
    }

    public double getFum_lost() {
        return fum_lost;
    }

    public double getFum() {
        return fum;
    }

    public double getSafe() {
        return safe;
    }
}
