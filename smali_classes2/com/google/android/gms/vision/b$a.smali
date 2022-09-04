.class public Lcom/google/android/gms/vision/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Lcom/google/android/gms/vision/d$b;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/util/SparseArray;Lcom/google/android/gms/vision/d$b;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<TT;>;",
            "Lcom/google/android/gms/vision/d$b;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/b$a;->a:Landroid/util/SparseArray;

    iput-object p2, p0, Lcom/google/android/gms/vision/b$a;->b:Lcom/google/android/gms/vision/d$b;

    iput-boolean p3, p0, Lcom/google/android/gms/vision/b$a;->c:Z

    return-void
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/vision/b$a;->a:Landroid/util/SparseArray;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/vision/d$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/b$a;->b:Lcom/google/android/gms/vision/d$b;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/vision/b$a;->c:Z

    return v0
.end method
