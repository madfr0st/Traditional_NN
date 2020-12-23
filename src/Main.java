import NN.Network;
import trainset.TrainSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Network net = new Network(2,2,2,1);

        TrainSet set = new TrainSet(2, 1);
        set.addData(new double[]{1,1}, new double[]{1});
        set.addData(new double[]{1,0}, new double[]{1});
        set.addData(new double[]{0,0}, new double[]{1});
        set.addData(new double[]{0,1}, new double[]{0});

        net.train(set, 100000, 4);

        for(int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(net.calculate(set.getInput(i)))+" |||| " + net.MSE(set.getInput(i), set.getOutput(i)));
        }
        System.out.println();
        System.out.println(net.MSE(set));
    }
}
