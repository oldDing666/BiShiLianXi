package atGuiGuStudy.juc;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/8/18 9:37 下午
 */
public enum CountryEnum {
    // ONE(1,"齐",v2,v3,v4...)可以放多个字段
    ONE(1, "齐"), TWO(2, "楚"), THREE(3, "燕"), FOUR(4, "赵"), FIVE(5, "魏"), SIX(6, "韩");

    private Integer retCode;
    private String retMessage;

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    /**
     * 查找特定的枚举值
     * @param index
     * @return
     */
    public static CountryEnum forEach_CountryEnum(int index) {
        CountryEnum[] myArray = CountryEnum.values();
        for (CountryEnum element : myArray) {
            if (element.getRetCode() == index) {
                return element;
            }
        }
        return null;
    }
}
