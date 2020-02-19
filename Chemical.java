package GUI1

public class Chemical {
  private String chem, dil, vol;
  public Chemical (chem, dil, vol) {
    this.chem = chem;
    this.dil = dil;
    this.vol = vol;
  }
  public String getChem() {
    return chem;
  }
  public String getDil() {
    return dil;
  }
  public String getVol() {
    return vol;
  }
}
