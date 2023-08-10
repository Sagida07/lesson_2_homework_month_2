public class Japan extends Countries{

        private String nationalMusicalInstrument;
        private String mostFamousAnime;

        @Override
        public void print() {
            System.out.println("Национальный музыкальный инструмент Японии: " + nationalMusicalInstrument +
                    " \nСамое популярно аниме : " + mostFamousAnime);
        }

        public Japan(String name, String nationalMusicalInstrument, String mostFamousAnime) {
            super(name);
            this.nationalMusicalInstrument = nationalMusicalInstrument;
            this.mostFamousAnime = mostFamousAnime;
        }
    }

