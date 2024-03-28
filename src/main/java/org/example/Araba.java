package org.example;

public class Araba {
    private String marka;
    private String vites;
    private int model;
    private int kilometre;

    public static final class ArabaBuilder {
        private String marka;
        private String vites;
        private int model;
        private int kilometre;

        private ArabaBuilder() {
        }

        public static ArabaBuilder aAraba() {
            return new ArabaBuilder();
        }

        public ArabaBuilder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public ArabaBuilder withVites(String vites) {
            this.vites = vites;
            return this;
        }

        public ArabaBuilder withModel(int model) {
            this.model = model;
            return this;
        }

        public ArabaBuilder withKilometre(int kilometre) {
            this.kilometre = kilometre;
            return this;
        }

        public Araba build() {
            Araba araba = new Araba();
            araba.marka = this.marka;
            araba.vites = this.vites;
            araba.model = this.model;
            araba.kilometre = this.kilometre;
            return araba;
        }
    }

    @Override
    public String toString() {
        return "Araba{" +
                "marka='" + marka + '\'' +
                ", vites='" + vites + '\'' +
                ", model=" + model +
                ", kilometre=" + kilometre +
                '}';
    }
}

