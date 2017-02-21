package dev5.Team.Team.Developers;

/**
 * Created by Владимир on 21.02.2017.
 */
public class Lead extends Developer {
  private String qualification;
  private int productivity;
  private int salary;
  private double priceIndex;

  public Lead(int productivity, int salary) {
    this.qualification = "Lead";
    this.productivity = productivity;
    this.salary = salary;
    this.priceIndex = salary / productivity;
  }

  public String getQualification() {
    return qualification;
  }

  public int getProductivity() {
    return productivity;
  }

  public int getSalary() {
    return salary;
  }

  public double getPriceIndex() {
    return priceIndex;
  }
}
