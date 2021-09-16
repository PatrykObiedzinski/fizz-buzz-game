class FizzBuzzGenerator {

    private FizzableStrategy fizzableStrategy = new ModuloThreeBuzzStrategy();
    private BuzzableStrategy buzzableStrategy = new ModuloFiveBuzzStrategy();

    String getNext(int n){
        String fizzOrBuzz = fizzableStrategy.gezFizz(n) + buzzableStrategy.getBuzz(n);

        return !fizzOrBuzz.equals("") ?
                fizzOrBuzz :
                Integer.toString(n);
    }
}
