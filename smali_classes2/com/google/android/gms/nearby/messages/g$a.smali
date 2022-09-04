.class public Lcom/google/android/gms/nearby/messages/g$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/nearby/messages/g$a;->a:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/nearby/messages/g$a;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/nearby/messages/g$a;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/nearby/messages/g$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/nearby/messages/g$a;->a:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/nearby/messages/g$a;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/nearby/messages/g$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/nearby/messages/g$a;->a:I

    return-object p0
.end method

.method public a()Lcom/google/android/gms/nearby/messages/g;
    .locals 2

    new-instance v0, Lcom/google/android/gms/nearby/messages/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/nearby/messages/g;-><init>(Lcom/google/android/gms/nearby/messages/g$a;Lcom/google/android/gms/nearby/messages/g$1;)V

    return-object v0
.end method
