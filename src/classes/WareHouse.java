package classes;

public class WareHouse {
    private int unitCommodity;//количество единиц товара
    private double unitCost;//Стоимость единицы товар
    private String nameCommodity;//Название товара

    public WareHouse() {
    }

    public WareHouse(int unitCommodity, double unitCost) {
        this.unitCommodity = unitCommodity;
        this.unitCost = unitCost;
    }

    public int getUnitCommodity() {
        return unitCommodity;
    }

    public void setUnitCommodity(int unitCommodity) {
        this.unitCommodity = unitCommodity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "unitCommodity=" + unitCommodity +
                ", unitCost=" + unitCost +
                '}';
    }

    public void changeUnitCommodity (int change){
        if (change < 0 & Math.abs(change) > unitCommodity){
            System.out.println("Остаток товара на складе - " + unitCommodity + " Изменения не внесены.");
        } else {
            unitCommodity +=change;
        }
    }

    public void changeUnitCost (double change){
        if (change < 0 & Math.abs(change) > unitCost){
            System.out.println("Цена товара станет меньше 0. Изменения не внесены.");
        } else {
            unitCost +=change;
        }
    }

   public void costOfAllUnits (){
       System.out.println("Стоимость всех товаров на складе - " + unitCommodity*unitCost);
   }

   public void comparisonOfTheCost (double firstCost, double secondCost){
        if (firstCost > secondCost){
            System.out.println("Стоимость первого товара выше на " + (firstCost/secondCost -1)*100 + " процентов");
        } else if (firstCost < secondCost){
            System.out.println("Стоимость второго товара выше на " + (secondCost/firstCost -1)*100 + " процентов");
        } else {
            System.out.println("Стоимость товаров одинакова.");
        }
   }
}
