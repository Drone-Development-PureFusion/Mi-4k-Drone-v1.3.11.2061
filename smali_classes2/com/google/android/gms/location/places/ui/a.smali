.class public Lcom/google/android/gms/location/places/ui/a;
.super Lcom/google/android/gms/location/places/ui/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/ui/a$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x2

.field public static final b:I = 0x1

.field public static final c:I = 0x2


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/location/places/ui/d;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/location/places/d;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/location/places/ui/d;->c(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/location/places/d;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/location/places/ui/d;->d(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
