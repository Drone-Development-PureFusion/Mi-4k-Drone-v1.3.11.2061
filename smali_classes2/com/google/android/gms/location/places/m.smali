.class public final Lcom/google/android/gms/location/places/m;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/places/m$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final c:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/location/places/m$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/location/places/m$a;->a(Lcom/google/android/gms/location/places/m$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/m;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/location/places/m$a;->b(Lcom/google/android/gms/location/places/m$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/m;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/location/places/m$a;->c(Lcom/google/android/gms/location/places/m$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/location/places/m;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/location/places/m$a;Lcom/google/android/gms/location/places/m$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/location/places/m;-><init>(Lcom/google/android/gms/location/places/m$a;)V

    return-void
.end method
