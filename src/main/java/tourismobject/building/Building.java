package tourismobject.building;

import tourismobject.TourismObject;
import utils.GetClassInfo;

public abstract class Building extends TourismObject {
    protected final static String type = "dbo:Building";
    protected int space;
    protected int towerHeight;
    protected int buildingType;

    public static void main(String[] args) {
//        System.out.println(GetClassInfo.getInheritedFieldsName(new Building()));
    }
}