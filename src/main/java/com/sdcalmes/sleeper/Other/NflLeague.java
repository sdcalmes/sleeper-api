package com.sdcalmes.sleeper.Other;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

public class NflLeague
{

    public enum Conferences
    {
        AFC,
        NFC,
        NONE
    }
    public enum Divisions
    {
        NFCNorth,
        NFCSouth,
        NFCEast,
        NFCWest,
        AFCNorth,
        AFCSouth,
        AFCEast,
        AFCWest,
        NONE
    }

    public enum Teams {
        ARI,
        ATL,
        BAL,
        BUF,
        CAR,
        CHI,
        CIN,
        CLE,
        DAL,
        DET,
        DEN,
        GB,
        HOU,
        IND,
        JAX,
        KC,
        LAC,
        LAR,
        LV,
        MIA,
        MIN,
        NE,
        NO,
        NYG,
        NYJ,
        PHI,
        PIT,
        SEA,
        SF,
        TB,
        TEN,
        WAS
        ;

        public Conferences getTeamConference()
        {
            switch(this)
            {
                case GB:
                case MIN:
                case DET:
                case CHI:
                case CAR:
                case NO:
                case ATL:
                case TB:
                case ARI:
                case LAR:
                case SF:
                case SEA:
                case DAL:
                case WAS:
                case NYG:
                case PHI:
                    return Conferences.NFC;
                case IND:
                case HOU:
                case JAX:
                case TEN:
                case CIN:
                case CLE:
                case BAL:
                case PIT:
                case KC:
                case LAC:
                case LV:
                case DEN:
                case NE:
                case BUF:
                case MIA:
                case NYJ:
                    return Conferences.AFC;
                default:
                    return Conferences.NONE;
            }
        }

        public Divisions getTeamDivision()
        {
            switch(this)
            {
                case GB:
                case MIN:
                case DET:
                case CHI:
                    return Divisions.NFCNorth;
                case CAR:
                case NO:
                case ATL:
                case TB:
                    return Divisions.NFCSouth;
                case ARI:
                case LAR:
                case SF:
                case SEA:
                    return Divisions.NFCWest;
                case DAL:
                case WAS:
                case NYG:
                case PHI:
                    return Divisions.NFCEast;
                case IND:
                case HOU:
                case JAX:
                case TEN:
                    return Divisions.AFCSouth;
                case CIN:
                case CLE:
                case BAL:
                case PIT:
                    return Divisions.AFCNorth;
                case KC:
                case LAC:
                case LV:
                case DEN:
                    return Divisions.AFCWest;
                case NE:
                case BUF:
                case MIA:
                case NYJ:
                    return Divisions.AFCEast;
                default:
                    return Divisions.NONE;
            }
        }
    }
}
