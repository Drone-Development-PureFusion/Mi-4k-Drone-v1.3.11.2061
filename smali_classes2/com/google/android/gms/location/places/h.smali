.class public Lcom/google/android/gms/location/places/h;
.super Lcom/google/android/gms/common/data/a;

# interfaces
.implements Lcom/google/android/gms/common/api/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/a",
        "<",
        "Lcom/google/android/gms/location/places/g;",
        ">;",
        "Lcom/google/android/gms/common/api/m;"
    }
.end annotation


# static fields
.field private static final b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/google/android/gms/location/places/internal/PlaceLikelihoodEntity;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Lcom/google/android/gms/common/api/Status;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/places/h$1;

    invoke-direct {v0}, Lcom/google/android/gms/location/places/h$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/places/h;->b:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/location/places/n;->c(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/h;->e:Lcom/google/android/gms/common/api/Status;

    invoke-static {p2}, Lcom/google/android/gms/location/places/h$a;->a(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/location/places/h;->d:I

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->f()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->f()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/h;->c:Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/location/places/h;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method public static a(Landroid/os/Bundle;)I
    .locals 1

    const-string v0, "com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/places/h;->e:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public synthetic a(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/places/h;->b(I)Lcom/google/android/gms/location/places/g;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/location/places/g;
    .locals 2

    new-instance v0, Lcom/google/android/gms/location/places/internal/n;

    iget-object v1, p0, Lcom/google/android/gms/location/places/h;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/location/places/internal/n;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method

.method public h()Ljava/lang/CharSequence;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/places/h;->c:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/h;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "attributions"

    iget-object v2, p0, Lcom/google/android/gms/location/places/h;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
