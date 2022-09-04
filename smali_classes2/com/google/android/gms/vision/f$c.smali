.class Lcom/google/android/gms/vision/f$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/vision/f;

.field private b:Lcom/google/android/gms/vision/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/g",
            "<TT;>;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/vision/f;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/vision/f$c;->a:Lcom/google/android/gms/vision/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/vision/f$c;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/f;Lcom/google/android/gms/vision/f$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/f$c;-><init>(Lcom/google/android/gms/vision/f;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/f$c;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/vision/f$c;->c:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/vision/f$c;)Lcom/google/android/gms/vision/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/f$c;->b:Lcom/google/android/gms/vision/g;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/vision/f$c;Lcom/google/android/gms/vision/g;)Lcom/google/android/gms/vision/g;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/f$c;->b:Lcom/google/android/gms/vision/g;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/vision/f$c;)I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/vision/f$c;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/vision/f$c;->c:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/vision/f$c;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/vision/f$c;->c:I

    return v0
.end method
