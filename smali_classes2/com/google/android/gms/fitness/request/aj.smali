.class public Lcom/google/android/gms/fitness/request/aj;
.super Lcom/google/android/gms/fitness/data/y$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/aj$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/fitness/request/b;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/fitness/request/b;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/fitness/data/y$a;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/request/b;

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/aj;->a:Lcom/google/android/gms/fitness/request/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/b;Lcom/google/android/gms/fitness/request/aj$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/aj;-><init>(Lcom/google/android/gms/fitness/request/b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/data/DataPoint;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/aj;->a:Lcom/google/android/gms/fitness/request/b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/fitness/request/b;->a(Lcom/google/android/gms/fitness/data/DataPoint;)V

    return-void
.end method
