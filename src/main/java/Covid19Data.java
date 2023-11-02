public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;

    public Covid19Data(String region, String aldersGruppe, int døde, int indlagtePåIntensiv, int indlagte){
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
    }

    @Override
    public String toString() {
        return  " region: " + region +
                " aldersGruppe: " + aldersGruppe +
                " døde: " + døde +
                " indlagtePåIntensiv: " + indlagtePåIntensiv +
                " indlagte: " + indlagte;
    }
}
