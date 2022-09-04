.class public final Lcom/google/android/gms/cast/a$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/a$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/a$c$a;
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/cast/CastDevice;

.field final b:Lcom/google/android/gms/cast/a$d;

.field private final c:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/a$c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/cast/a$c$a;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object v0, p0, Lcom/google/android/gms/cast/a$c;->a:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p1, Lcom/google/android/gms/cast/a$c$a;->b:Lcom/google/android/gms/cast/a$d;

    iput-object v0, p0, Lcom/google/android/gms/cast/a$c;->b:Lcom/google/android/gms/cast/a$d;

    invoke-static {p1}, Lcom/google/android/gms/cast/a$c$a;->a(Lcom/google/android/gms/cast/a$c$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/a$c;->c:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/a$c$a;Lcom/google/android/gms/cast/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/a$c;-><init>(Lcom/google/android/gms/cast/a$c$a;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/a$c;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/a$c;->c:I

    return v0
.end method

.method public static a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;)Lcom/google/android/gms/cast/a$c$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/a$c$a;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/a$c$a;-><init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;)V

    return-object v0
.end method
