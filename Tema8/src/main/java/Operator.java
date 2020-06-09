

public enum Operator implements Operation {


    ADDITION {
        @Override

        public int calculate(Number fistNumber, Number secondNumber) {
            logger.info("ADDITION in progress...");

            return fistNumber.intValue() + secondNumber.intValue();

        }

    },

    DIVIDE {
        @Override
        public int calculate(Number firstNumber, Number secondNumber) throws DivideBy1MilException {


            if (secondNumber.intValue() >= 1000000) {
                throw new DivideBy1MilException("You cannot divide by 1 Mil or above");
            }
            if (secondNumber.intValue() <= -1000000) {
                throw new DivideByMinus1MilException("You cannot divide by -1 Mil or less");
            }

            logger.info("DIVIDE in progress...");
            return firstNumber.intValue() / secondNumber.intValue();
        }
    },

    MULTIPLY {
        @Override
        public int calculate(Number fistNumber, Number secondNumber) {
            logger.info("MULTIPLY in progress...");
            return fistNumber.intValue() * secondNumber.intValue();


        }
    },

    MODULO {
        @Override
        public int calculate(Number fistNumber, Number secondNumber) {
            logger.info("MODULO in progress...");
            return fistNumber.intValue() % secondNumber.intValue();


        }
    },

    SUBTRACTION {
        @Override
        public int calculate(Number fistNumber, Number secondNumber) {
            logger.info("SUBTRACTION in progress...");
            return fistNumber.intValue() - secondNumber.intValue();


        }
    }


}

