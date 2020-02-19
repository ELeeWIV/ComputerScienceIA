public class Date {
  private int day, month, year, period, room;
  public Date (String day, String month, String year, String period, String room) {
    this.day = day;
    this.month = month;
    this.year = year;
    this.period = period;
    this.room = room;
  }
  public int getDate() {
    return date;
  }
  public int getMonth() {
    return month;
  }
  public int getYear() {
    return year;
  }
  public int getPeriod() {
    return period;
  }
  public int getRoom() {
    return room;
  }
}
