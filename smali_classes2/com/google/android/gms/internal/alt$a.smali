.class Lcom/google/android/gms/internal/alt$a;
.super Lcom/google/android/gms/internal/amd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/fitness/result/BleDevicesResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/fitness/result/BleDevicesResult;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/amd$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/alt$a;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alt$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/alt$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/fitness/result/BleDevicesResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/alt$a;->a:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
