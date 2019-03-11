def names(module):
    filter(dir(module), lambda n: not n.startswith('_'))