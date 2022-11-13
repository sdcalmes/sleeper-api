package com.sdcalmes.sleeper.Player;

public enum Positions {
    WR3("WR"),
    WR2("WR"),
    WR1("WR"),
    WLB,
    TE,
    SS("DB"),
    LS,
    SLB,
    RT,
    RG,
    RDT,
    RDE,
    DT,
    DL,
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
    KOS,
    FS,
    FB,
    CB,
    C,
    ROLB,
    RILB,
    LOLB,
    LILB,
    SAM,
    RUSH,
    NT,
    DE,
    LOB,
    NB,
    WILL,
    MIKE,
    PK,
    PR,
    P,
    KR,
    EDGE,
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
