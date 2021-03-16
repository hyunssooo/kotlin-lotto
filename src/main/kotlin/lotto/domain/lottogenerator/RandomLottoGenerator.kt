package lotto.domain.lottogenerator

import lotto.domain.Lotto
import lotto.domain.LottoNumber

object RandomLottoGenerator : LottoGenerator {

    override fun generate(): Lotto {
        return Lotto(
            LottoNumber.RANGE.toList()
                .shuffled()
                .take(Lotto.SIZE)
                .map { LottoNumber.of(it) }
                .toSortedSet()
        )
    }
}
