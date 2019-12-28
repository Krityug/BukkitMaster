package bukkit.org.master.commands;

import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.remain.Remain;


public class BackupDataCommand extends SimpleCommand {
    public BackupDataCommand() {
        super("backup");
        setPermissionMessage("Restores Data of the whole network to our database.");
        setTellPrefix(Common.colorize("&8[&EGame Manager&8]"));
        setPermission("admin.restore.data");
    }

    @Override
    protected void onCommand() {
        checkConsole();
        checkPerm("admin.restore.data");

        Player player = getPlayer();

        Remain.sendTitle(player,20,30,20, Common.colorize("&A&LRestoring Data..."),Common.colorize(""));
        Common.tell(player,Common.colorize("&8Processing Request package..."));
        Common.tell(player,Common.colorize("&AGenerated brand new data file for player") + player.getName());
    }
}
