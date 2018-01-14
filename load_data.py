{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 44,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[4, 9, 19, 20, 21, 26, 12, 1, 7, 10, 23, 28, 32, 16, 4, 6, 7, 10, 13, 25, 3, 4, 6, 15, 17, 30, 31, 16, 1, 3, 10, 21, 26, 27, 6, 1, 9, 19, 21, 23, 26, 7] [5, 8, 9, 14, 17, 23, 8]\n"
     ]
    }
   ],
   "source": [
    "import io, os, sys, types\n",
    "from IPython import get_ipython\n",
    "from nbformat import read\n",
    "from IPython.core.interactiveshell import InteractiveShell\n",
    "\n",
    "def get_data():\n",
    "    fr=open(r\"C:\\Users\\ddd\\Desktop\\test.txt\")\n",
    "    x_data=[]\n",
    "    y_data=[]\n",
    "    counter=0\n",
    "    for i in range(7):\n",
    "        line=fr.readline()\n",
    "        counter+=1\n",
    "        if counter%7==0:\n",
    "            line=line.split(' ')\n",
    "        #    print(line)\n",
    "       #     print(line[3])\n",
    "            y_data.append(int(line[1]))\n",
    "            y_data.append(int(line[2]))\n",
    "            y_data.append(int(line[3]))\n",
    "            y_data.append(int(line[4]))\n",
    "            y_data.append(int(line[5]))\n",
    "            y_data.append(int(line[6]))\n",
    "            y_data.append(int(line[7]))\n",
    "        if counter%7!=0:\n",
    "            line=line.split(' ')\n",
    "        #    print(line)\n",
    "       #     print(line[3])\n",
    "            x_data.append(int(line[1]))\n",
    "            x_data.append(int(line[2]))\n",
    "            x_data.append(int(line[3]))\n",
    "            x_data.append(int(line[4]))\n",
    "            x_data.append(int(line[5]))\n",
    "            x_data.append(int(line[6]))\n",
    "            x_data.append(int(line[7]))\n",
    "    return x_data,y_data \n",
    " # #  for da in line:\n",
    "     #   print(int(da))\n",
    "          \n",
    "if __name__=='__main__':\n",
    "    X,Y=get_data()\n",
    "    print(X,Y)\n",
    "    \n",
    "\n",
    "    "
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 1,
   "metadata": {},
   "outputs": [
    {
     "ename": "ImportError",
     "evalue": "No module named 'load_data'",
     "output_type": "error",
     "traceback": [
      "\u001b[1;31m---------------------------------------------------------------------------\u001b[0m",
      "\u001b[1;31mImportError\u001b[0m                               Traceback (most recent call last)",
      "\u001b[1;32m<ipython-input-1-1a165a76eb59>\u001b[0m in \u001b[0;36m<module>\u001b[1;34m()\u001b[0m\n\u001b[1;32m----> 1\u001b[1;33m \u001b[1;32mimport\u001b[0m \u001b[0mload_data\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n\u001b[0m\u001b[0;32m      2\u001b[0m \u001b[0mx\u001b[0m\u001b[1;33m,\u001b[0m\u001b[0my\u001b[0m\u001b[1;33m=\u001b[0m\u001b[0mload_data\u001b[0m\u001b[1;33m.\u001b[0m\u001b[0mget_data\u001b[0m\u001b[1;33m(\u001b[0m\u001b[1;33m)\u001b[0m\u001b[1;33m\u001b[0m\u001b[0m\n",
      "\u001b[1;31mImportError\u001b[0m: No module named 'load_data'"
     ]
    }
   ],
   "source": [
    "import load_data\n",
    "x,y=load_data.get_data()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.5.1"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 2
}
