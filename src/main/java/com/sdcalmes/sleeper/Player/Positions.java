package com.sdcalmes.sleeper.Player;

public enum Positions {
    WR3("WR"),
    WR2("WR"),
    WR1("WR"),
    WLB,
    TE,
    SS,
    SLB,
    RT,
    RG,
    RDT,
    RDE,
    RCB,
    RB,
    QB,
    MLB,
    LT,
    LG,
    LDT,
    LDE,
    LCB,
    K,
    FS,
    C
    ;

    public final String position;

    private Positions()
    {
        this.position = this.toString();
    }

    private Positions(String position)
    {
        this.position = position;
    }
}
