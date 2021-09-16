class ModuloFiveBuzzStrategy implements BuzzableStrategy {

    private static final String BUZZ_VALUE = "Buzz";
    private static final String DEFAULT_VALUE = "";

    @Override
    public String getBuzz(int input) {

        return input % 5 == 0 ?
                BUZZ_VALUE :
                DEFAULT_VALUE;
    }
}
