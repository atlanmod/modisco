@rem ***************************************************************************
@rem Copyright (c) 2011 Mia-Software.
@rem All rights reserved. This program and the accompanying materials
@rem are made available under the terms of the Eclipse Public License v1.0
@rem which accompanies this distribution, and is available at
@rem http://www.eclipse.org/legal/epl-v10.html
@rem ***************************************************************************
rem to generate parser and lexer class, put the antlr library in current folder 
rem don't forget to update the command line with the version of antlr library
java -jar antlr-3.2.jar -fo output -lib . JSP.g
pause
