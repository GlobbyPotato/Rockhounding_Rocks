//----------------------------------
//-------Rock Vending System--------
//----------------------------------
//Parameters = input, oredict, quantity
//input = the input itemstack used as fee
//oredict = if oredicted equivalent will be allowed
//quantity = amount of rocks the item will allow to purchase (max 64)
mods.rockhounding_rocks.RockVendor.add(<minecraft:wheat>, true, 28);

//Parameters = input
//input = the fee to remove
mods.rockhounding_rocks.RockVendor.remove(<minecraft:diamond>);


//----------------------------------
//--------Cutting Station-----------
//----------------------------------
//Parameters = input, code, output
//input = the block to be cut
//code = the code for the type of cut
//output = the output cut block
mods.rockhounding_rocks.CuttingStation.add(<minecraft:wool:0>, 2, <minecraft:stained_glass:0>);


//----------------------------------
//----------Stone Rammer------------
//----------------------------------
//Parameters = input, output
//input = the block to be cut
//output = the output cut block
mods.rockhounding_rocks.StoneRammer.add(<minecraft:stone:1>, <minecraft:stone:2>);


//----------------------------------
//----------Carving Bench-----------
//----------------------------------
//Parameters = input, code, output
//input = the block to be cut
//code = the code for the type of cut
//output = the output cut block
mods.rockhounding_rocks.CarvingBench.add(<minecraft:stone:0>, 3, <minecraft:stonebrick:0>);


//----------------------------------
//----------Sculpting Bench-----------
//----------------------------------
//Parameters = input, code, output
//input = the block to be cut
//code = the code for the type of cut
//output = the output cut block
mods.rockhounding_rocks.SculptingBench.add(<minecraft:quartz_block:0>, 1, <minecraft:quartz_block:2>);
