from nis import cat # type: ignore
import task26

def test_compare_strings(): # type: ignore
    assert task26.equal_strings(cat, CAT) == cat

def test_compare_strings():
    assert task26.not_equal_strings(cat, CAT) != cat