package testmybatis.model;

import lombok.Getter;

public enum Enable {
    Red(1, "红色");

    @Getter
    private int val;

    @Getter
    private String desc;

    Enable(int val, String desc) {
        this.val = val;
        this.desc = desc;
    }

    public static String getDescByVal(int val) {
        for (Enable enable : values()) {
            if (val == enable.getVal()) {
                return enable.getDesc();
            }
        }
        return "";
    }
}
