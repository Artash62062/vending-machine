package commands;

import commands.Command;

public class CommandProcessor {
    public Command getCommandByString(String commandInString) {
        String[] strings = commandInString.split(":");
        String key = strings[0];
        Integer index = Integer.parseInt(strings[1]);
        Integer count = Integer.parseInt(strings[2]);
        return new Command(key,index,count);
    }

}
