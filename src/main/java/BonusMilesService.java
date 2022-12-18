public class BonusMilesService {

    private static final int ROUBLES_PER_BONUS_MILE = 20; // количество рублей, необходимое для получения бонусной мили

    public int calculate(int cost) {
        return cost / ROUBLES_PER_BONUS_MILE;
    }
}
