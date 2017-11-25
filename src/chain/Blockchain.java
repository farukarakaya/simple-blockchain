package chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import block.Block;
import block.BlockUtil;

public class Blockchain {

	private static List<Block> blockchain;

	static {
		initBlockchain();
	}

	public static Block getLatestBlock() {
		return blockchain.get(blockchain.size()-1);
	}

	public static void pushNewBlock(Block new_block) {
		blockchain.add(new_block);
	}

	private static void initBlockchain() {
		blockchain = new ArrayList<>();
		blockchain.add(BlockUtil.generateGenesisBlock());
	}

}
