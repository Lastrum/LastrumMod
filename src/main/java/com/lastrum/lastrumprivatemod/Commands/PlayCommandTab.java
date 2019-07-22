package com.lastrum.lastrumprivatemod.Commands;

import com.lastrum.lastrumprivatemod.Util.codeshortcuts.Chat;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlayCommandTab extends CommandBase {
    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("queue");
    }

    @Override
    public String getCommandName() {
        return "play";
    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        if (args.length == 0) {
            Chat.prefix("You gotta put a game, bucko");
        } else {
            final String playcmd = String.join(" ", (CharSequence[])args);
            Chat.send("/play " + playcmd);
        }
    }
    public List<String> addTabCompletionOptions(final ICommandSender sender, final String[] args, final BlockPos pos) {
        final List<String> list = new ArrayList<String>(Arrays.asList(
                // #MegaWalls
                "mw_standard",
                "mw_face_off",
                // #Blitz
                "blitz_solo_normal",
                "blitz_solo_nokits",
                "blitz_teams_normal",
                // #Skywars
                "ranked_normal",
                "solo_normal",
                "teams_normal",
                "solo_insane",
                "teams_insane",
                "mega_normal",
                "mega_doubles",
                "solo_insane_tnt_madness",
                "teams_insane_tnt_madness",
                "solo_insane_rush",
                "teams_insane_rush",
                "solo_insane_slime",
                "teams_insane_slime",
                "solo_insane_lucky",
                "teams_insane_lucky",
                "solo_insane_hunters_vs_beasts",
                // #TNTGames
                "tnt_tntrun",
                "tnt_pvprun",
                "tnt_bowspleef",
                "tnt_tnttag",
                "tnt_capture",
                // #BedWars
                "bedwars_eight_one",
                "bedwars_eight_two",
                "bedwars_four_three",
                "bedwars_four_four",
                "bedwars_capture",
                "bedwars_eight_two_rush",
                "bedwars_four_four_rush",
                "bedwars_eight_two_ultimate",
                "bedwars_four_four_ultimate",
                "bedwars_castle",
                // #Arcade
                "arcade_hole_in_the_wall",
                "arcade_soccer",
                "arcade_bounty_hunters",
                "arcade_pixel_painters",
                "arcade_dragon_wars",
                "arcade_ender_spleef",
                "arcade_starwars",
                "arcade_throw_out",
                "arcade_creeper_attack",
                "arcade_party_games_1",
                "arcade_party_games_2",
                "arcade_party_games_3",
                "arcade_farm_hunt",
                "arcade_zombies_dead_end",
                "arcade_zombies_bad_blood",
                "arcade_zombies_alien_arcadium",
                "arcade_hide_and_seek_prop_hunt",
                "arcade_hide_and_seek_party_pooper",
                "arcade_simon_says",
                "arcade_mini_walls",
                "arcade_day_one",
                "arcade_hypixel_sports",
                // #CVC
                "mcgo_normal",
                "mcgo_deathmatch",
                "mcgo_normal_party",
                "mcgo_deathmatch_party",
                // #BuildBattle
                "build_battle_solo_normal",
                "build_battle_teams_normal",
                "build_battle_solo_pro",
                "build_battle_guess_the_build",
                // #CrazyWalls
                "crazy_walls_solo_normal",
                "crazy_walls_solo_chaos",
                "crazy_walls_team_normal",
                "crazy_walls_team_chaos",
                // #UHC
                "uhc_solo",
                "uhc_teams",
                "uhc_events",
                // #Vampz
                "vampirez",
                // #Quakecraft
                "quake_solo",
                "quake_teams",
                // #Paintball
                "paintball",
                // #ArenaBrawl
                "arena_1v1",
                "arena_2v2",
                "arena_4v4",
                // #Walls
                "walls",
                // #Tkr / #TurboKartRacers
                "tkr",
                // #Duels
                "duels_classic_duel",
                "duels_sw_duel",
                "duels_sw_doubles",
                "duels_bow_duel",
                "duels_uhc_duel",
                "duels_uhc_doubles",
                "duels_uhc_four",
                "duels_potion_duel",
                "duels_combo_duel",
                "duels_op_duel",
                "duels_op_doubles",
                "duels_mw_duel",
                "duels_mw_doubles",
                "duels_sumo_duel",
                "duels_blitz_duel",
                "duels_bowspleef_duel",
                "duels_bridge_duel",
                "duels_bridge_doubles",
                "duels_bridge_four",
                "duels_bridge_2v2v2v2",
                "duels_bridge_3v3v3v3",
                "duels_bridge_tournament",
                "duels_uhc_tournament",
                "duels_uhc_tournament",
                "duels_sw_tournament",
                "duels_sumo_tournament",
                // #SkyClash (RIP)
                // #SmashHeroes
                "super_smash_solo_normal",
                "super_smash_2v2_normal",
                "super_smash_1v1_normal",
                "super_smash_teams_normal",
                "super_smash_friends_normal",
                // #MurderMystery
                "murder_classic",
                "murder_assassins",
                "murder_showdown",
                "murder_infection",
                // #Prototype
                // #CaptureTheWool
                "prototype_pvp_ctw",
                // #KOTH #KingOfTheHill
                "prototype_koth_two_team",
                "prototype_koth_four_team",
                "prototype_towerwars_solo",
                "prototype_towerwars_team_of_two",
                // #SKYBLOCK
                "skyblock"
        ));
        return ((args.length == 1) ? getListOfStringsMatchingLastWord(args, (String[])list.toArray(new String[0])) : null);
    }
}
