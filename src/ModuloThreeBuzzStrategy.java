class ModuloThreeBuzzStrategy implements FizzableStrategy {

    private static final String FIZZ_VALUE = "Fizz";
    private static final String DEFAULT_VALUE = "";

    @Override
    public String gezFizz(int input) {

        return input % 3 == 0 ?
                FIZZ_VALUE :
                DEFAULT_VALUE;
    }
}
