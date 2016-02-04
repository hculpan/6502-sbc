#bin2hex
This little Java program converts a 6502 binary image into an Intel hex file.

The program accepts the following parameters:
  -s <location>  The memory starting location, optional for PRG files, required for all others.

If the program is given a file with a PRG extension, it assumes that the first two bytes indicate the memory starting location. In this case, the -s parameter is optional, but if given will override what is in the file. 
