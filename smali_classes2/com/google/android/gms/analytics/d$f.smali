.class public Lcom/google/android/gms/analytics/d$f;
.super Lcom/google/android/gms/analytics/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/d$d",
        "<",
        "Lcom/google/android/gms/analytics/d$f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/analytics/d$d;-><init>()V

    const-string v0, "&t"

    const-string v1, "screenview"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/d$f;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/analytics/d$d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/analytics/d$d;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
