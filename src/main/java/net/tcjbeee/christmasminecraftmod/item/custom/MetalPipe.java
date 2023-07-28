package net.tcjbeee.christmasminecraftmod.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.tcjbeee.christmasminecraftmod.sound.ModSounds;

public class MetalPipe extends SwordItem {

    public MetalPipe(Tier pTier, Properties pProperties){
        super(Tiers.IRON, 2, 3.0f, pProperties);

    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i<= positionClicked.getY() + 64; i++) {
                BlockState state = pContext.getLevel().getBlockState(positionClicked.below(i));

                if(isValidBlock(player)) {
                    foundBlock = true;
                    player.playSound(ModSounds.METAL_PIPE.get(), 1f, 1f);
                    break;
                }
            }

        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }

    private boolean isValidBlock(Player player) {
        return true;
    }

   /* @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(pLevel.isClientSide() && pUsedHand == InteractionHand.MAIN_HAND) {
            pPlayer.playSound(ModSounds.METAL_PIPE.get(), 1f, 1f);


        }


        return super.use(pLevel, pPlayer, pUsedHand);
    } */

}